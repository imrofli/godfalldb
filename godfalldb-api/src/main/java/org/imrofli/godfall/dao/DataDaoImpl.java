package org.imrofli.godfall.dao;

import org.imrofli.godfall.dao.intf.DataDao;
import org.imrofli.godfall.data.Converter;
import org.imrofli.godfall.data.SourceData;
import org.imrofli.godfall.helpers.DataHelper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

@Service
public class DataDaoImpl implements DataDao {

    private SourceData mainData;
    @Override
    public SourceData getMainData() {
        if(mainData==null){
            String filePath = DataHelper.getDatasetPath().getPath();
            String content = null;
            try {
                content = Files.lines(Paths.get(filePath))
                        .collect(Collectors.joining(System.lineSeparator()));
                mainData = Converter.fromJsonString(content);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return mainData;
    }
}

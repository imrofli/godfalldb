Godfalldb:

args to start:
--datasetPath path-to\source_data.json

unpack data files:
get UnrealPak tool
https://github.com/somethingcoolmustbehere/UnrealPakTool

check the small cmd in tools folder

todo:
split ui and api
create api
cleanup
make db persistent (postgres or keep h2)
frontload a webserver so app needs not to be on Root & easy domain name switching like test.godfallbd.ch
versioning of configs/data
externalize properties
file loader (watcher) to automatically load new datafiles

stuff to look at:
graphQL
better Json-java generator
swagger & openApi codegen

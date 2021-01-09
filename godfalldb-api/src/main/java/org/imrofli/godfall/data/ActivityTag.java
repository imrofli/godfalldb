package org.imrofli.godfall.data;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ActivityTag {
    private List<Activity1> activity1;
    private List<Activity> activity2;
    private List<Activity> activity3;

    @JsonProperty("activity1")
    public List<Activity1> getActivity1() { return activity1; }
    @JsonProperty("activity1")
    public void setActivity1(List<Activity1> value) { this.activity1 = value; }

    @JsonProperty("activity2")
    public List<Activity> getActivity2() { return activity2; }
    @JsonProperty("activity2")
    public void setActivity2(List<Activity> value) { this.activity2 = value; }

    @JsonProperty("activity3")
    public List<Activity> getActivity3() { return activity3; }
    @JsonProperty("activity3")
    public void setActivity3(List<Activity> value) { this.activity3 = value; }
}

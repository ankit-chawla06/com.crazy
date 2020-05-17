package com.Crazy;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.validation.constraints.NotEmpty;
import java.util.Collections;
import java.util.Map;
public class HelloDropWizConfiguration extends Configuration {
    // TODO: implement service configuration
    //@NotEmpty
    private String template ;

    @NotEmpty
    private String defaultName = "Noob Chawla";

    @JsonProperty
    public void setTemplate(String template){
        this.template=template;
    }

    @JsonProperty
    public String getTemplate(){
        return template;
    }

    @JsonProperty
    public String getDefaultName(){
        return defaultName;
    }

    @JsonProperty
    public void setDefaultName(String name){
        this.defaultName=name;
    }


}


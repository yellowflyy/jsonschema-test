package com.jsonschema.test.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jvx.trc.validator.JsonValidator;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;
import java.io.InputStream;

public class JsonSchemaValidator {
    public static boolean validatorJsonSchema(String json1, String json2){
        return JsonValidator.validatorSchema(json1,json2);
    }


    public static void main(String[] args){
        String json2 = "{\"number\":1}";
        String json1 = "";
        boolean isSuccess = false;
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = null;
        try {
            resources = resolver.getResources("classpath:test.json");
            if(resources != null){
                for (Resource r:resources) {
                    String filename = r.getFilename();
                    InputStream in = JsonValidator.class.getResourceAsStream("/"+filename);
                    if(in != null){
                        JSONObject json = JSON.parseObject(in, JSONObject.class);
                        JSONObject jsonStr = json.getJSONObject("properties");
                        json1 = jsonStr.toString();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        isSuccess = validatorJsonSchema(json1,json2);
        System.out.println(isSuccess);
    }
}

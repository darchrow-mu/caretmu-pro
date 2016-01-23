package com.caretmu.common.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;

/**
 * Created by darchrow on 2016/1/24.
 */
public class SystemObjectMapper extends ObjectMapper{

    public SystemObjectMapper()
    {
        super();
        // 允许单引号
        this.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        // 字段和值都加引号
        this.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        // 数字也加引号
        //this.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, true);
        this.configure(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS, true);

        this.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        // 这个有效果
        this.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        // 空值处理为空串
        /*this.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>() {
            @Override
            public void serialize(
                    Object value,
                    JsonGenerator jg,
                    SerializerProvider sp) throws IOException
            {
                jg.writeString("");
            }
        });*/

    }
}

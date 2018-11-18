package com.funtime.bigdata.spark.boot.autoconfigure.properties;

import java.util.Properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("spark")
public class SparkProperties {

    private String appname;

    private String master;

    private String hiveUris;

    private Properties props = new Properties();

    private StreamingProperties streaming = new StreamingProperties();

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public StreamingProperties getStreaming() {
        return streaming;
    }

    public void setStreaming(StreamingProperties streaming) {
        this.streaming = streaming;
    }

    public String getHiveUris() {
        return hiveUris;
    }

    public void setHiveUris(String hiveUris) {
        this.hiveUris = hiveUris;
    }

    @ConfigurationProperties("streaming")
    public static class StreamingProperties {

        private Integer duration;

        public Integer getDuration() {
            return duration;
        }

        public void setDuration(Integer duration) {
            this.duration = duration;
        }
    }
}

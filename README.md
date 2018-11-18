## Spring Boot Starter for Spark    
Spring Boot Starter for Spark    

## edit pom.xml,add dependency

```javascript
<dependency>
    <groupId>com.funtime.bigdata.spark</groupId>
    <artifactId>spark-spring-boot-starter</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

## create application.properties

```javascript
============= SPARK =========
spark.appname=log-analysis
spark.master=local[2]
spark.props.driver.cores=1
spark.props.driver.maxResultSize=1g
spark.props.driver.memory=1g
spark.props.local.dir=/tmp
spark.streaming.duration=1000    

spark.hiveUris=thrift://hadoop.namenode:9083    

============= HDFS ==========
hdfs.url=hdfs://hadoop.namenode:8020
```

## use in spring boot 

```javascript
@Autowired
private JavaSparkContext sparkContext;    

@Autowired
private SparkSession sparkSession;    

@Autowired
private JavaStreamingContext streamingContext;
```

## use hive in spring boot 

```javascript
sparkSession.sql("show databases").show();
```
package com.springboot.elastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  docker 安装容器命令
 *   注意springboot和elasticsearch的版本关系 可以springboot官网查询
 *   docker run -it -e ES_JAVA_OPTS="-Xms256m -Xmx256m"  -e "discovery.type=single-node" -p 9200:9200 -p  9300:9300 --name ES01 911f580307ae
 */
@SpringBootApplication
public class ElasticJestDatasearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticJestDatasearchApplication.class, args);
    }

}

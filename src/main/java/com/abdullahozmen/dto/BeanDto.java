package com.abdullahozmen.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class BeanDto {
    private Long id;
    private String beanName;
    private String beanData;

    public void initialBeanMethod(){
        log.info("Bean çalışmaya başlayınca çalışır");
        System.err.println("Başladı");
    }
    public void destroyBeanMethod(){
        log.info("Bean bittikten sonra çalışır");
        System.err.println("Bitti");
    }
}

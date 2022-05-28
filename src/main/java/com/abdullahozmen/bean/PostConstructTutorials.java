package com.abdullahozmen.bean;

import com.abdullahozmen.controller.BeanController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@Controller
public class PostConstructTutorials {
    @Autowired
    private Logger LOG;

    /*public PostConstructTutorials(){
        LOG.info("Log info çağrıldı");
    }*/

    // bean henüz başlamadığından NullPointerException hatası alınır. Burada bağımlılığı enjecte edemiyoruz.
    // Görevi: Bir bean nesnesi oluşturulduğunda hemen oluşur.
    @PostConstruct
    public void init(){
        LOG.info("Log info çağrıldı.");
    }

    public static void main(String[] args) {
        PostConstructTutorials beanController = new PostConstructTutorials();
        System.out.println(beanController);
    }
}

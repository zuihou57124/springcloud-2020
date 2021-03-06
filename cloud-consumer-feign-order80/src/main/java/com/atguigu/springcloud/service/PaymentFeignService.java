package com.atguigu.springcloud.service;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
/**
 * @author wsk
 * @date 2020/3/13 21:08
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-SERVICE")  //指定调用哪个微服务
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")    //指定微服务暴露的请求地址
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/discovery")//指定微服务暴露的请求地址
    Object discovery();

    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeout();

}
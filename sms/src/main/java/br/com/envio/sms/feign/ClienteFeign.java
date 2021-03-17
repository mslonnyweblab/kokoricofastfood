package br.com.envio.sms.feign;


import org.springframework.cloud.openfeign.FeignClient;


@FeignClient(value = "${servidor.sms.url}")
public interface ClienteFeign {
}

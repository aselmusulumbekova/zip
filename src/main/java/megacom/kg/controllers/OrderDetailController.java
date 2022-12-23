package megacom.kg.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import megacom.kg.configs.Swagger2;
import megacom.kg.models.dto.DaysDTO;
import megacom.kg.models.dto.OrderDetailsDTO;
import megacom.kg.service.DaysService;
import megacom.kg.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/order_details")
@Api(tags = Swagger2.OrderDetails)
public class OrderDetailController {
    @Autowired
    private OrderDetailService service;

    @PostMapping("/save")
    @ApiOperation("Сохранение")
    public ResponseEntity<?> save(@RequestBody OrderDetailsDTO orderDetailsDTO){
        try {
            System.out.println("test");
            return ResponseEntity.ok(service.save(orderDetailsDTO));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }
}

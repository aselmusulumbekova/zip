package megacom.kg.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import megacom.kg.configs.Swagger2;
import megacom.kg.microservices.FileServiceFeign;
import megacom.kg.models.dto.ChannelsDTO;
import megacom.kg.service.ChannelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/channels")
@Api(tags = Swagger2.Channels)
public class ChannelsControllers {
    @Autowired
    private ChannelsService service;
    @Autowired
    FileServiceFeign fileServiceFein;


    @GetMapping("/feign")
    ResponseEntity<?> fileUpload(){
        return ResponseEntity.ok(fileServiceFein.fileUpload());
    }

    @PostMapping("/save")
    @ApiOperation("Сохранение")
    public ResponseEntity<?> save(@RequestBody ChannelsDTO channelsDTO){
        try {
            System.out.println("test");
            return ResponseEntity.ok(service.save(channelsDTO));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }


}

package megacom.kg.microservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@FeignClient(name = "${micro.fileService.name}", url = "${micro.fileService.url}")
public interface FileServiceFeign {

  @PostMapping("/api/v1/file/upload")
  List<Response> fileUpload();
//  Response upload(@RequestParam MultipartFile file);

}

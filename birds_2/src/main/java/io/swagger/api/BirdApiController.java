package io.swagger.api;

import io.swagger.model.Bird;
import io.swagger.model.Bird.StatusEnum;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-01T15:04:00.809Z")

@RestController
public class BirdApiController implements BirdApi {
	
	
    @RequestMapping(
    		value = "/hellobird", 
    		method = RequestMethod.GET,
    		produces = "application/json")
    
	public ResponseEntity<Bird> getBird(
    		HttpServletRequest request, 
    		HttpServletResponse response) 
   
    {
        	
        	Bird aBird = new Bird();
        	aBird.setName("blue tit");
        	aBird.setStatus(StatusEnum.SEEN);
        	aBird.setId(new Long(1));
        	
        	System.out.println(">>>rbird:" + aBird.toString() + ":");
        	
        	return new ResponseEntity<Bird>(aBird, HttpStatus.OK);

    }
	
	
	// curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' -d '{"category": {"id": 0,    "name": "b1"  },  "id": 0,  "name": "Hawk",  "photoUrls": [    "string"  ],  "status": "SEEN",  "tags": [    { "id": 0, "name": "string"}]}' 'http://localhost:8080/v2/bird'
    

    public ResponseEntity<Void> addBird(

@ApiParam(value = "Bird object that needs to be added to the collection" ,required=true ) @RequestBody Bird body

) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateBird(

@ApiParam(value = "Bird object that needs to be added to the collection" ,required=true ) @RequestBody Bird body

) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

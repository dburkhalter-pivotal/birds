package io.swagger.api;

import io.swagger.model.Bird;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-01T15:04:00.809Z")

@Api(value = "bird", description = "the bird API")
public interface BirdApi {

    @ApiOperation(value = "Add a new bird to the collection", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "bird_auth", scopes = {
            @AuthorizationScope(scope = "write:Birds", description = "modify Birds in your account"),
            @AuthorizationScope(scope = "read:Birds", description = "read your Birds")
            })
    }, tags={ "Bird", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    @RequestMapping(value = "/bird",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addBird(

@ApiParam(value = "Bird object that needs to be added to the collection" ,required=true ) @RequestBody Bird body

);


    @ApiOperation(value = "Update an existing Bird", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "bird_auth", scopes = {
            @AuthorizationScope(scope = "write:Birds", description = "modify Birds in your account"),
            @AuthorizationScope(scope = "read:Birds", description = "read your Birds")
            })
    }, tags={ "Bird", })
    
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Bird not found", response = Void.class),
        @ApiResponse(code = 405, message = "Validation exception", response = Void.class) })
    @RequestMapping(value = "/bird",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateBird(

@ApiParam(value = "Bird object that needs to be added to the collection" ,required=true ) @RequestBody Bird body

);

}

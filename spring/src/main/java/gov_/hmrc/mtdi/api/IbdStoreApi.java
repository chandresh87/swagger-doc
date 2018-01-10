/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.11).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package gov_.hmrc.mtdi.api;

import io.swagger.model.Store;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Api(value = "IbdStore", description = "the IbdStore API")
public interface IbdStoreApi {

    Logger log = LoggerFactory.getLogger(IbdStoreApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Add a new income store", nickname = "addStore", notes = "", authorizations = {
        @Authorization(value = "MTDI_auth", scopes = {
            @AuthorizationScope(scope = "write:income", description = "modify income store"),
            @AuthorizationScope(scope = "read:income", description = "read income stoe")
            })
    }, tags={ "IbdStore", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 405, message = "Invalid input"),
        @ApiResponse(code = 500, message = "Internal Server Error") })
    @RequestMapping(value = "/createStore",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> addStore(@ApiParam(value = "income store object that needs to be added to the IBD" ,required=true )  @Valid @RequestBody Store body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default IbdStoreApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get a income store by ID", nickname = "getAllStore", notes = "get a income store by ID", response = Store.class, tags={ "IbdStore", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Income store object", response = Store.class),
        @ApiResponse(code = 405, message = "Invalid input"),
        @ApiResponse(code = 500, message = "Internal Server Error") })
    @RequestMapping(value = "/getAllStore/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<Store> getAllStore(@ApiParam(value = "Id of store object",required=true) @PathVariable("id") String id) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("\"\"", Store.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default IbdStoreApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get a income store by ID", nickname = "getStore", notes = "get a income store by ID", response = Store.class, tags={ "IbdStore", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Income store object", response = Store.class),
        @ApiResponse(code = 405, message = "Invalid input"),
        @ApiResponse(code = 500, message = "Internal Server Error") })
    @RequestMapping(value = "/getStore/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<Store> getStore(@ApiParam(value = "Id of store object",required=true) @PathVariable("id") String id) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("\"\"", Store.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default IbdStoreApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "update a income store by ID", nickname = "putStore", notes = "udpate a income store by ID", response = Store.class, responseContainer = "List", tags={ "IbdStore", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All Income store object", response = Store.class, responseContainer = "List"),
        @ApiResponse(code = 405, message = "Invalid input"),
        @ApiResponse(code = 500, message = "Internal Server Error") })
    @RequestMapping(value = "/getStore/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<List<Store>> putStore(@ApiParam(value = "Id of store object",required=true) @PathVariable("id") String id) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ \"\", \"\" ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default IbdStoreApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}

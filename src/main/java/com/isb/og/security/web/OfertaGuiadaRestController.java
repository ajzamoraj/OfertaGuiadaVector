package com.isb.og.security.web;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.isb.og.common.component.MockMetadata;
import com.isb.og.security.common.web.AbstractRestController;
import com.isb.og.security.form.exception.GenerateDocumentException;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * PDF REST controller.
 * 
 * @author Vector ITC Group
 * 
 */
@RestController
public class OfertaGuiadaRestController extends AbstractRestController {
    
    private static final Logger LOGGER = Logger.getLogger(OfertaGuiadaRestController.class);
    
    
//     Delete this injection when mock is not used
     @Autowired
     private MockMetadata mockMetadata;
    
    /**
     * Gets the notes.
     * 
     * @param ids {@link List} of {@link Integer}
     * @param result {@link BindingResult}
     * @return {@link List} of {@link GeneratePdfRSModel}
     * @throws GenerateDocumentException 
     * @throws Exception
     */
    @ApiOperation(value = "Hello World Oferta Guiada", nickname = "ofertaguiada")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
            @ApiResponse(code = 201, message = "Created", response = String.class),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Server failure") })
    @ApiImplicitParams({
            @ApiImplicitParam(name = "generatePdfRQModel", value = "JSON structure with request information",
                    required = true, dataType = "GeneratePdfRQModel", paramType = "path") })
    @CrossOrigin(origins = "${app.crossorigin.generatepdf}")
    @ResponseBody
    @RequestMapping(value = "${app.security.prefix}/ofertaguiada", produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET)
    public ResponseEntity<String> ofertaguiada() {
        
        String response = "Rest Oferta guiada";        
        LOGGER.info("Rest Oferta guiada...");
        return new ResponseEntity<String>(response, HttpStatus.OK);
        
    }
    
}

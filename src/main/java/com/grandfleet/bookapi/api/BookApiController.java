package com.grandfleet.bookapi.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-29T18:39:10.497Z[GMT]")
@RestController
public class BookApiController implements BookApi {

    private static final Logger log = LoggerFactory.getLogger(BookApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BookApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> bookGetBook(@Parameter(in = ParameterIn.QUERY, description = "See https://developers.google.com/books/docs/v1/using#WorkingVolumes " ,schema=@Schema()) @Valid @RequestParam(value = "q", required = false) String q,@Parameter(in = ParameterIn.QUERY, description = "You can use the filter parameter to restrict the returned results further by setting it to one of the following values:  partial - Returns results where at least parts of the text are previewable. full - Only returns results where all of the text is viewable. free-ebooks - Only returns results that are free Google eBooks. paid-ebooks - Only returns results that are Google eBooks with a price. ebooks - Only returns results that are Google eBooks, paid or free. Examples of non-eBooks would be publisher content that is available in limited preview and not for sale, or magazines. " ,schema=@Schema(allowableValues={ "partial", "full", "free-ebooks", "paid-ebooks", "ebooks" }
)) @Valid @RequestParam(value = "filter", required = false) String filter,@Parameter(in = ParameterIn.QUERY, description = "You use the download parameter to restrict the returned results to volumes that have an available download format of epub by setting the to the value epub.  The following example searches for books with an epub download available: " ,schema=@Schema(allowableValues={ "epub", "pdf" }
)) @Valid @RequestParam(value = "download", required = false) String download,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "startIndex", required = false) Integer startIndex, @Max(40) @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema(allowableValues={  }, maximum="40"
, defaultValue="10")) @Valid @RequestParam(value = "maxResults", required = false, defaultValue="10") Integer maxResults,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema(allowableValues={ "all", "books", "magazines" }
)) @Valid @RequestParam(value = "printType", required = false) String printType,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema(allowableValues={ "relevance", "newest" }
)) @Valid @RequestParam(value = "orderBy", required = false) String orderBy) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}

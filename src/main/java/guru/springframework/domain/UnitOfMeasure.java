package guru.springframework.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 *  Created by igavrysh
 */
@Getter
@Setter
@Document
public class UnitOfMeasure {

    private String id;

    private String description;

}

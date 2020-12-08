package pl.mpazdzior.voucherstore.crm;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data
@NoArgsConstructor
public class Adress {
    private String street;
    private String zip;
    private String city;
}

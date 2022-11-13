package ensa.ssi.csrf.target.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Collection;

@Entity @Data @NoArgsConstructor @DiscriminatorValue("ret")
public class Retrait extends Operation {

}

package ensa.ssi.csrf.target.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity @NoArgsConstructor @Data
@DiscriminatorValue("courant")
public class CompteCourant extends Compte {
    private double decouvert;

    public CompteCourant(String code, Date dateCreation, double solde, double decouvert) {
        super(dateCreation, solde);
        this.decouvert = decouvert;
    }
}

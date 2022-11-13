package ensa.ssi.csrf.target.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@NoArgsConstructor
@Data
@DiscriminatorValue("epargne")
public class CompteEpargne extends Compte {
    private double taux;

    public CompteEpargne(String code, Date dateCreation, double solde, double taux) {
        super(dateCreation, solde);
        this.taux = taux;
    }
}

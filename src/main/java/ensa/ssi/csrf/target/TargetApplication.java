package ensa.ssi.csrf.target;

import ensa.ssi.csrf.target.entities.Client;
import ensa.ssi.csrf.target.entities.Compte;
import ensa.ssi.csrf.target.entities.CompteCourant;
import ensa.ssi.csrf.target.entities.CompteEpargne;
import ensa.ssi.csrf.target.services.client.ClientService;
import ensa.ssi.csrf.target.services.client.IClientService;
import ensa.ssi.csrf.target.services.compte.CompteService;
import ensa.ssi.csrf.target.services.compte.ICompteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class TargetApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(TargetApplication.class, args);

//        System.out.println("________________ Clients ________________");
//        IClientService clientService = ctx.getBean(ClientService.class);
//        clientService.saveEntity(new Client("OTHMANE HANYF"));
//        clientService.saveEntity(new Client("WAFAE ABOUZBIBA"));
//        clientService.saveEntity(new Client("HIND GLIUOLA"));
//        clientService.saveEntity(new Client("HAJAR FAIZ"));
//
//        List<Client> clients = clientService.getAllEntities();
//        clients.forEach(c -> System.out.println(c.getNom()));
//
//        System.out.println("________________ Comptes ________________");
//        ICompteService compteService = ctx.getBean(CompteService.class);
//        compteService.saveEntity(new CompteCourant(new Date(), 9000, new Client(1L), 8000));
//        compteService.saveEntity(new CompteCourant(new Date(), 10000, new Client(2L), 8000));
//        compteService.saveEntity(new CompteEpargne(new Date(), 9000, new Client(1L), 5.5));
////        1762912a-b990-44c7-b3ca-ad797a22b49c
////        a29cc0d1-1157-41b3-b6dd-6d77c85e454b
////        fe3b4881-d036-4e59-af66-6e3e8a703f4e
//        List<Compte> comptes = compteService.getAllEntities();
//        comptes.forEach(c -> System.out.println(c.getCode()));
    }
}

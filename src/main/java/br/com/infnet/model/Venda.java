package br.com.infnet.model;

import br.com.infnet.enums.VendaEnums;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "venda")
public abstract class Venda extends PanacheEntity {

    private VendaEnums tipo;

    public VendaEnums getTipo() {
        return tipo;
    }

    public void setTipo(VendaEnums tipo) {
        this.tipo = tipo;
    }
}

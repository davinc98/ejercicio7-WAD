/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.modelo.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author leoj_
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "Producto")
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idProducto;
    private String nombreProducto;
    private String descripcionProducto;
    private float precio;
    private int existencia;
    private int stockMinimo;
    
//    @ManyToOne(fetch=FetchType.LAZY)
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="idCategoria")
    private Categoria idCategoria;
    
    @Transient
    private Long idCat;

}

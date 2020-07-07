/*
* The MIT License
* 
* Copyright: Copyright (C) 2014 T2Ti.COM
* 
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in
* all copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
* THE SOFTWARE.
* 
* The author may be contacted at: t2ti.com@gmail.com
*
* @author Claudio de Barros (T2Ti.com)
* @version 2.0
*/
package com.t2tierp.model.bean.patrimonio;

import com.t2tierp.model.bean.cadastros.Empresa;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "PATRIM_GRUPO_BEM")
public class PatrimGrupoBem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "CONTA_ATIVO_IMOBILIZADO")
    private String contaAtivoImobilizado;
    @Column(name = "CONTA_DEPRECIACAO_ACUMULADA")
    private String contaDepreciacaoAcumulada;
    @Column(name = "CONTA_DESPESA_DEPRECIACAO")
    private String contaDespesaDepreciacao;
    @Column(name = "CODIGO_HISTORICO")
    private Integer codigoHistorico;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Empresa empresa;

    public PatrimGrupoBem() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getContaAtivoImobilizado() {
        return contaAtivoImobilizado;
    }

    public void setContaAtivoImobilizado(String contaAtivoImobilizado) {
        this.contaAtivoImobilizado = contaAtivoImobilizado;
    }

    public String getContaDepreciacaoAcumulada() {
        return contaDepreciacaoAcumulada;
    }

    public void setContaDepreciacaoAcumulada(String contaDepreciacaoAcumulada) {
        this.contaDepreciacaoAcumulada = contaDepreciacaoAcumulada;
    }

    public String getContaDespesaDepreciacao() {
        return contaDespesaDepreciacao;
    }

    public void setContaDespesaDepreciacao(String contaDespesaDepreciacao) {
        this.contaDespesaDepreciacao = contaDespesaDepreciacao;
    }

    public Integer getCodigoHistorico() {
        return codigoHistorico;
    }

    public void setCodigoHistorico(Integer codigoHistorico) {
        this.codigoHistorico = codigoHistorico;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "com.t2tierp.model.bean.patrimonio.PatrimGrupoBem[id=" + id + "]";
    }

}
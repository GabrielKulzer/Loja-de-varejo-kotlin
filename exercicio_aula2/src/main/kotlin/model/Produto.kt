import java.time.LocalDate

class Produto {
    var nome:String
    var preco:Float
    var quantidade:Short
    var validade: LocalDate
    var fornecedor:Fornecedor

    constructor(
        nome:String,
        preco:Float,
        quantidade:Short,
        validade:LocalDate,
        fornecedor:Fornecedor) {
        this.nome = nome
        this.preco = preco
        this.quantidade = quantidade
        this.validade = validade
        this.fornecedor = fornecedor
    }

    override fun toString(): String {
        return "Nome: ${this.nome}, Preço: ${this.preco}, Quantidade: ${this.quantidade}, Validade: ${this.validade}, Fornecedor: ${this.fornecedor}"
    }
}
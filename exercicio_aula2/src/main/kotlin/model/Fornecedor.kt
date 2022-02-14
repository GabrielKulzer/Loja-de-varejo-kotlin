class Fornecedor {
    var nome:String
    var endereco:String
    var telefoneComercial:String
    var transportadora:Transportadora
    var produto:Produto
    var email:String

    constructor(
        nome:String,
        endereco:String,
        telefoneComercial:String,
        transportadora:Transportadora,
        produto:Produto,
        email:String) {
        this.nome = nome
        this.endereco = endereco
        this.telefoneComercial = telefoneComercial
        this.transportadora = transportadora
        this.produto = produto
        this.email = email

    }

    override fun toString(): String {
        return "Nome: ${this.nome}, Endereco: ${this.endereco}, Telefone comercial: ${this.telefoneComercial}, Transportadora: ${this.transportadora}, Produto: ${this.produto}, Email: ${this.email}"
    }
}
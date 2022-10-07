public class houseBuilder {
    private house house;

    public houseBuilder() {
        house = new house();
    }

    public house build() {
        if (house.getCodigo() < 0) {
            throw new IllegalArgumentException("Código inválido");
        }
        if (house.getNomeDoProprietario().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (house.getCpfProprietario().equals("")) {
            throw new IllegalArgumentException("CPF inválido");
        }
        if (house.getTelefoneProprietario().equals("")) {
            throw new IllegalArgumentException("Telefone inválido");
        }
        if(house.getPreco() <= 0){
            throw new IllegalArgumentException("Preço inválido");
        }
        return house;
    }

    public houseBuilder setNumeroDeQuartos(int numeroDeQuartos) {
        house.setNumeroDeQuartos(numeroDeQuartos);
        return this;
    }

    public houseBuilder setNumeroDeBanheiros(int numeroDeBanheiros) {
        house.setNumeroDeBanheiros(numeroDeBanheiros);
        return this;
    }

    public houseBuilder setBairro(String bairro) {
        house.setBairro(bairro);
        return this;
    }

    public houseBuilder setRua(String rua) {
        house.setRua(rua);
        return this;
    }

    public houseBuilder setCidade(String cidade) {
        house.setCidade(cidade);
        return this;
    }

    public houseBuilder setEstado(String estado) {
        house.setEstado(estado);
        return this;
    }

    public houseBuilder setPais(String pais) {
        house.setPais(pais);
        return this;
    }

    public houseBuilder setCep(String cep) {
        house.setCep(cep);
        return this;
    }

    public houseBuilder setNumero(int numero) {
        house.setNumero(numero);
        return this;
    }

    public houseBuilder setComplemento(int complemento) {
        house.setComplemento(complemento);
        return this;
    }

    public houseBuilder setMetrosQuadrados(float metrosQuadrados) {
        house.setMetrosQuadrados(metrosQuadrados);
        return this;
    }

    public houseBuilder setCodigo(int codigo) {
        house.setCodigo(codigo);
        return this;
    }

    public houseBuilder setPreco(float preco) {
        house.setPreco(preco);
        return this;
    }

    public houseBuilder setNomeDoProprietario(String nomeDoProprietario) {
        house.setNomeDoProprietario(nomeDoProprietario);
        return this;
    }

    public houseBuilder setCpfProprietario(String cpfProprietario) {
        house.setCpfProprietario(cpfProprietario);
        return this;
    }

    public houseBuilder setTelefoneProprietario(String telefoneProprietario) {
        house.setTelefoneProprietario(telefoneProprietario);
        return this;
    }
}
package com.bankproject.apilubank.repository;

import com.bankproject.apilubank.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> { //dizer o tipo de moelo e o tipo de id


}

package com.bankproject.apilubank.repository;

import com.bankproject.apilubank.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> { //dizer o tipo de moelo e o tipo de id


}

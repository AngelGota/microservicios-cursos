package com.capas.microservicios.app.cursos.services;

import org.springframework.stereotype.Service;

import com.capas.microservicios.app.commons.services.CommonServiceImplement;
import com.capas.microservicios.app.cursos.models.entity.Curso;
import com.capas.microservicios.app.cursos.models.repository.CursoRepository;

@Service
public class CursoServiceImplement extends CommonServiceImplement<Curso, CursoRepository> implements CursoService {

}

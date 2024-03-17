package com.capas.microservicios.app.cursos.services;

import com.capas.microservicios.app.commons.services.CommonService;
import com.capas.microservicios.app.cursos.models.entity.Curso;

public interface CursoService extends CommonService<Curso> {

	public Curso findCursoByAlumnoId(Long id);
	
}

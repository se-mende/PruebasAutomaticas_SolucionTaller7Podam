package com.uniandes.pruebas.automaticas.universidad.estrategias;

import uk.co.jemos.podam.api.AttributeStrategy;
import uk.co.jemos.podam.exceptions.PodamMockeryException;

public class EdadEstrategia implements AttributeStrategy<Integer>{
	public Integer getValue() throws PodamMockeryException {
        return (int)(Math.random()*100+10);
    }
}
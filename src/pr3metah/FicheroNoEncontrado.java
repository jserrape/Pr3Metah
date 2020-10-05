/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3metah;

/**
 *
 * @author Juanca
 */
class FicheroNoEncontrado extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	FicheroNoEncontrado(String msg) {
        super(msg);
    }
}
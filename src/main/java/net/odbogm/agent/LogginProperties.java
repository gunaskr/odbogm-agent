/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.odbogm.agent;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Configuración de los log de cada clase
 * @author Marcelo D. Ré {@literal <marcelo.re@gmail.com>}
 */
public class LogginProperties {

    public static Level TransparentDirtyDetectorAdapter            = Level.FINEST;
    public static Level TransparentDirtyDetectorInstrumentator     = Level.FINEST;
    public static Level TransparentDirtyDetectorAgent              = Level.FINEST;
    public static Level InstrumentableClassDetector                = Level.FINEST;
    public static Level WriteAccessActivatorAdapter                = Level.FINEST;
    
}

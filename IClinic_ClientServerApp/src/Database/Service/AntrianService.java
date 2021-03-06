/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.Antrian;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public interface AntrianService extends Remote {
    Antrian insertAntrian(Antrian antrian) throws RemoteException;

    void updateAntrian(Antrian antrian) throws RemoteException;

    void deleteAntrian(int Id_Antrian) throws RemoteException;

    Antrian getAntrian(int Id_Antrian) throws RemoteException;

    List<Antrian> getAntrian() throws RemoteException;
}

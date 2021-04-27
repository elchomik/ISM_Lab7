package pollub.ism.ism_lab7_room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface PozycjaMagazynowaDAO {

    @Insert
    void insert(PozycjaMagazynowa pozycjaMagazynowa);

    @Update
    void update(PozycjaMagazynowa pozycjaMagazynowa);

    @Query("SELECT QUANTITY FROM Warzywniak WHERE NAME= :wybraneWarzywoNazwa")
    int findQuantityByName(String wybraneWarzywoNazwa);

    @Query("UPDATE Warzywniak SET QUANTITY =:wybraneWarzywoNowaIlosc WHERE NAME= :wybraneWarzywoNazwa")
    void updateQuantityByName(String wybraneWarzywoNazwa, int wybraneWarzywoNowaIlosc);

    @Query("SELECT COUNT(*) FROM Warzywniak")
    int size();

}

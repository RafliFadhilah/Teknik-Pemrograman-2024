/* 1 */
// Superclass Motor
abstract class Motor {
    abstract void info();
    abstract void infoTransmisi();
}

/* 2 */
// Transmisi Kopling
abstract class Kopling extends Motor {
    abstract void infoMerekKopling();
    void infoTransmisi() {
        System.out.println("Jenis Transmisi: Kopling");
    }
}

// Transmisi Matic
abstract class Matic extends Motor {
    abstract void infoMerekMatic();
    void infoTransmisi() {
        System.out.println("Jenis Transmisi: Matic");
    }
}

/* 3 */
// Motor Kopling MeYamaha
abstract class HondaKopling extends Kopling {
    abstract void infoNamaHondaKopling();
    void infoMerekKopling() {
        System.out.println("Merek Motor: Honda");
    }
}

// Motor Kopling Merek Yamaha
abstract class YamahaKopling extends Kopling {
    abstract void infoNamaYamahaKopling();
    void infoMerekKopling() {
        System.out.println("Merek Motor: Yamaha");
    }
}

// Motor Kopling Merek Suzuki
abstract class SuzukiKopling extends Kopling {
    abstract void infoNamaSuzukiKopling();
    void infoMerekKopling() {
        System.out.println("Merek Motor: Suzuki");
    }
}

/* 3 */
// Motor Matic Merek Honda
abstract class HondaMatic extends Matic {
    abstract void infoNamaHondaMatic();
    void infoMerekMatic() {
        System.out.println("Merek Motor: Honda");
    }
}

// Motor Matic Merek Yamaha
abstract class YamahaMatic extends Matic {
    abstract void infoNamaYamahaMatic();
    void infoMerekMatic() {
        System.out.println("Merek motor: Yamaha");
    }
}

// Motor Matic Merek Suzuki
abstract class SuzukiMatic extends Matic {
    abstract void infoNamaSuzukiMatic();
    void infoMerekMatic() {
        System.out.println("Merek motor: Suzuki");
    }
}


// Anggota Dari Class Merek Honda Bertipe Kopling
class CRF_150 extends HondaKopling {

    void info() {
        infoNamaHondaKopling();
        infoMerekKopling();
        infoTransmisi();
        
    }

    @Override
    void infoNamaHondaKopling() {
        System.out.println("Nama Motor: CRF 150");    
    }
}

// Anggota Dari Class Merek Honda Bertipe Kopling
class CB_150R extends HondaKopling {

    void info() {
        infoNamaHondaKopling();
        infoMerekKopling();
        infoTransmisi();    
    }
    
    @Override
    void infoNamaHondaKopling() {
        System.out.println("Nama Motor: CB 150 R");    
    }
}

// Anggota Dari Class Merek Yamaha Bertipe Kopling
class MT_15 extends YamahaKopling {

    void info() {
        infoNamaYamahaKopling();
        infoMerekKopling();
        infoTransmisi();    
    }
    
    @Override
    void infoNamaYamahaKopling() {
        System.out.println("Nama Motor: MT-15");    
    }
}

// Anggota Dari Class Merek Yamaha Bertipe Kopling
class R15 extends YamahaKopling {

    void info() {
        infoNamaYamahaKopling();
        infoMerekKopling();
        infoTransmisi();    
    }
    
    @Override
    void infoNamaYamahaKopling() {
        System.out.println("Nama Motor: R15");    
    }
}

// Anggota dari Class Merek Suzuki bertipe Kopling
class GSX_R150 extends SuzukiKopling {

    void info() {
        infoNamaSuzukiKopling();
        infoMerekKopling();
        infoTransmisi();    
    }
    
    @Override
    void infoNamaSuzukiKopling() {
        System.out.println("Nama Motor: GSX R150");    
    }
}

// Anggota dari Class Merek Honda bertipe Matic
class VARIO_160 extends HondaMatic {
    void info() {
        infoNamaHondaMatic();
        infoMerekMatic();
        infoTransmisi();
    }

    @Override
    void infoNamaHondaMatic() {
        System.out.println("Nama Motor: Vario 160");     
    }
}

// Anggota dari Class Merek Yamaha bertipe Matic
class AEROX_155 extends YamahaMatic {
    void info() {
        infoNamaYamahaMatic();
        infoMerekMatic();
        infoTransmisi();
    }

    @Override
    void infoNamaYamahaMatic() {
        System.out.println("Nama Motor: Aerox 155");     
    }
}

// Anggota dari Class Merek Suzuki bertipe Matic
class BURGMAN_125 extends SuzukiMatic {
    void info() {
        infoNamaSuzukiMatic();
        infoMerekMatic();
        infoTransmisi();
    }

    @Override
    void infoNamaSuzukiMatic() {
        System.out.println("Nama Motor: Burgman 125");     
    }
}

// Main Program
public class Tugas_3 {
    public static void main(String[] args) {


        CRF_150 Motor1 = new CRF_150();
        Motor1.info();

        System.out.println();

        CB_150R Motor2 = new CB_150R();
        Motor2.info();

        System.out.println();

        MT_15 Motor3 = new MT_15();
        Motor3.info();

        System.out.println();

        R15 Motor4 = new R15();
        Motor4.info();

        System.out.println();

        GSX_R150 Motor5 = new GSX_R150();
        Motor5.info();

        System.out.println();

        VARIO_160 Motor6 = new VARIO_160();
        Motor6.info();

        System.out.println();

        AEROX_155 Motor7 = new AEROX_155();
        Motor7.info();

        System.out.println();

        BURGMAN_125 Motor8 = new BURGMAN_125();
        Motor8.info();
        
        System.out.println();
    }
}
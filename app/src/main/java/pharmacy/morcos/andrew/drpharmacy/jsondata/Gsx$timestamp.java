
package pharmacy.morcos.andrew.drpharmacy.jsondata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Gsx$timestamp {

    @SerializedName("$t")
    @Expose
    private String $t;

    /**
     * 
     * @return
     *     The $t
     */
    public String get$t() {
        return $t;
    }

    /**
     * 
     * @param $t
     *     The $t
     */
    public void set$t(String $t) {
        this.$t = $t;
    }

}

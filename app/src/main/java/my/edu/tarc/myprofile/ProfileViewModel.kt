package my.edu.tarc.myprofile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel: ViewModel() {
    /*private val _profile: MutableLiveData<Profile> by lazy {
        MutableLiveData<Profile>(
            Profile("",
            "","")
        )
    }
    val profile: LiveData<Profile> get() = _profile*/

    var profile = Profile("","","")
}
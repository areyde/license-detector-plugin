package com.jetbrains.packagesearch.intellij.plugin.api.model

import com.google.gson.annotations.SerializedName
import com.jetbrains.licensedetector.intellij.plugin.licenses.License

data class StandardV2Licenses(

        @SerializedName("main_license")
        val mainLicense: License?,

        @SerializedName("other_licenses")
        val otherLicenses: List<License>?
)

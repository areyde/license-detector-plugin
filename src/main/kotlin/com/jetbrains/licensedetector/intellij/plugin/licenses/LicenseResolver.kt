package com.jetbrains.licensedetector.intellij.plugin.licenses

fun getLicenseOnSpdxIdOrNull(spdxId: String): License? {
    return when (spdxId) {
        Apache_2_0.spdxId -> Apache_2_0
        BSD_3_Clause.spdxId -> BSD_3_Clause
        GPL_3_0_or_later.spdxId -> GPL_3_0_or_later
        LGPL_2_1_or_later.spdxId -> LGPL_2_1_or_later
        MIT.spdxId -> MIT
        else -> null
    }
}

fun getCompatiblePackageLicenses(projectLicenses: Set<SupportedLicense>): List<SupportedLicense> {
    return projectLicenses.map { it.compatiblePackageLicenses }.reduce { acc, set ->
        acc.intersect(set)
    }.toList().sortedBy { it.name }
}
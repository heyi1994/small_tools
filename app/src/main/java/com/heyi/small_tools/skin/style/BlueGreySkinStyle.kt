package com.heyi.small_tools.skin.style

import android.graphics.Color
import com.heyi.small_tools.skin.SkinStyle

/**
 * #### 灰蓝主题 ;
 * @author Heyi
 * @since 1.0.0
 */
object BlueGreySkinStyle {
    val STATUS_COLOR = Color.parseColor("#455A64")
    val COLOR_FRAME_BG = Color.parseColor("#607D8B")
    val COLOR_FRAME_TEXT_COLOR = Color.parseColor("#FFFFFF")
    val COLOR_FRAME_SECOND_TEXT_COLOR = Color.parseColor("#CFD8DC")
    val WHITE_FRAME_TEXT_COLOR = Color.parseColor("#212121")
    val WHITE_FRAME_SECOND_TEXT_COLOR = Color.parseColor("#757575")
    val THEME_TITLE = "BlueGrey"

    fun create(): SkinStyle {
        return SkinStyle.Builder().apply {
            setStatusColor(STATUS_COLOR)
            setColorFrameBg(COLOR_FRAME_BG)
            setColorFrameTextColor(COLOR_FRAME_TEXT_COLOR)
            setColorFrameSecondTextColor(COLOR_FRAME_SECOND_TEXT_COLOR)
            setWhiteFrameTextColor(WHITE_FRAME_TEXT_COLOR)
            setWhiteFrameSecondTextColor(WHITE_FRAME_SECOND_TEXT_COLOR)
            setThemeTitle(THEME_TITLE)
        }.build()
    }
}
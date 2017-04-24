package com.kk.taurus.playerbase.inter;

import com.kk.taurus.playerbase.setting.BaseAdImage;

import java.util.List;

/**
 * Created by Taurus on 2017/4/24.
 */

public interface IAdImageCover {
    void setImageAdState(boolean state);
    void setAdBoxState(boolean state);
    void refreshAdData(List<BaseAdImage> adImages);
}
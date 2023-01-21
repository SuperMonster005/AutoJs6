package org.autojs.autojs.core.ui.inflater.inflaters;

import androidx.annotation.Nullable;

import org.autojs.autojs.core.graphics.ScriptCanvasView;
import org.autojs.autojs.core.ui.inflater.ResourceParser;
import org.autojs.autojs.core.ui.inflater.ViewCreator;
import org.autojs.autojs.runtime.ScriptRuntime;

/**
 * Created by Stardust on 2018/3/16.
 */
public class CanvasViewInflater extends BaseViewInflater<ScriptCanvasView> {

    private final ScriptRuntime mScriptRuntime;

    public CanvasViewInflater(ResourceParser resourceParser, ScriptRuntime runtime) {
        super(resourceParser);
        mScriptRuntime = runtime;
    }

    @Nullable
    @Override
    public ViewCreator<ScriptCanvasView> getCreator() {
        return (context, attrs) -> new ScriptCanvasView(context, mScriptRuntime);
    }
}
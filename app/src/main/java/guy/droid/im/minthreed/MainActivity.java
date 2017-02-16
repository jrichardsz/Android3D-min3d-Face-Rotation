package guy.droid.im.minthreed;


import android.os.Bundle;

import min3d.core.Object3dContainer;
import min3d.core.RendererActivity;
import min3d.core.RendererActivity;
import min3d.parser.IParser;
import min3d.parser.Parser;
import min3d.vos.Light;

public class MainActivity extends RendererActivity {

    private Object3dContainer faceObject3D;
    private Object3dContainer objModel;
    /** Called when the activity is first created. */    @Override    public void initScene()
    {
        scene.lights().add(new Light());
        scene.lights().add(new Light());
        Light myLight = new Light();
       // myLight.position.setY(150f);
        scene.lights().add(myLight);


     //  IParser myParser = Parser.createParser(Parser.Type.MAX_3DS, getResources(), "guy.droid.im.minthreed:raw/r8",true);
        IParser myParser = Parser.createParser(Parser.Type.OBJ, getResources(), "guy.droid.im.minthreed:raw/face_obj",true);
        myParser.parse();
        faceObject3D = myParser.getParsedObject();
        faceObject3D.position().x = faceObject3D.position().y = faceObject3D.position().z = 0;
        faceObject3D.position().z =-.2f;
       // faceObject3D.scale().x = faceObject3D.scale().y = faceObject3D.scale().z = .9f;
        faceObject3D.scale().x = faceObject3D.scale().y = faceObject3D.scale().z = .009f;
        scene.addChild(faceObject3D);
        // Depending on the model you will need to change the scale faceObject3D.scale().x = faceObject3D.scale().y = faceObject3D.scale().z = 0.009f;        scene.addChild(faceObject3D); */
    }
    @Override    public void updateScene() {
   //    faceObject3D.rotation().x ++;
   //    faceObject3D.rotation().z ++;
         faceObject3D.rotation().y ++;
    }

}

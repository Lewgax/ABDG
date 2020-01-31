package com.lewgax.aboutdragons.entity.model;




import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


public class DrakeModel extends AdvancedModelBase {
	
    public AdvancedModelRenderer chest;
    public AdvancedModelRenderer cabeca;
    public AdvancedModelRenderer pernaFrenteEsquerda;
    public AdvancedModelRenderer pernaFrenteDireita;
    public AdvancedModelRenderer inicioCauda;
    public AdvancedModelRenderer pernaTrasDireita;
    public AdvancedModelRenderer pernaTrasEsquerda;
    public AdvancedModelRenderer ossoAsaDireita;
    public AdvancedModelRenderer ossoAsaEsquerda;
    public AdvancedModelRenderer bocaC;
    public AdvancedModelRenderer BocaB;
    public AdvancedModelRenderer scaleE;
    public AdvancedModelRenderer scaleD;
    public AdvancedModelRenderer panturrilhaFrenteEsquerda;
    public AdvancedModelRenderer peFrenteEsquerdo;
    public AdvancedModelRenderer panturrilhaFrenteDireita;
    public AdvancedModelRenderer peFrentedireito;
    public AdvancedModelRenderer meioCauda;
    public AdvancedModelRenderer fimCauda;
    public AdvancedModelRenderer panturrilhaTrasDireita;
    public AdvancedModelRenderer peTrasDireito;
    public AdvancedModelRenderer panturrilhaTrasEsquerda;
    public AdvancedModelRenderer peTrasEsquerdo;
    public AdvancedModelRenderer osso1AsaDireita;
    public AdvancedModelRenderer pele1Asadireita;
    public AdvancedModelRenderer peleAsadireita;
    public AdvancedModelRenderer osso1AsaEsquerda;
    public AdvancedModelRenderer peleAsaEsquerda;
    public AdvancedModelRenderer pele1AsaEsquerda;
    
   
     
    public DrakeModel() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.ossoAsaDireita = new AdvancedModelRenderer(this, 0, 0);
        this.ossoAsaDireita.setRotationPoint(-0.5F, -0.8F, 3.1F);
        this.ossoAsaDireita.addBox(0.0F, 0.0F, 0.0F, 12, 1, 1, 0.0F);
        this.setRotateAngle(ossoAsaDireita, 0.0F, -2.8246408614276226F, 0.3839724354387525F);
        this.panturrilhaTrasEsquerda = new AdvancedModelRenderer(this, 0, 0);
        this.panturrilhaTrasEsquerda.setRotationPoint(0.0F, 1.7F, 0.5F);
        this.panturrilhaTrasEsquerda.addBox(0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(panturrilhaTrasEsquerda, -0.3839724354387525F, 0.0F, 0.0F);
        this.peleAsaEsquerda = new AdvancedModelRenderer(this, 44, 12);
        this.peleAsaEsquerda.setRotationPoint(6.3F, 0.8F, 0.5F);
        this.peleAsaEsquerda.addBox(-4.7F, 0.0F, 0.0F, 10, 6, 0, 0.0F);
        this.setRotateAngle(peleAsaEsquerda, -0.05235987755982988F, 0.0F, 0.05201081170943102F);
        this.inicioCauda = new AdvancedModelRenderer(this, 0, 0);
        this.inicioCauda.setRotationPoint(-1.6F, 6.8F, -1.6F);
        this.inicioCauda.addBox(0.1F, 0.0F, 0.0F, 3, 6, 3, 0.0F);
        this.setRotateAngle(inicioCauda, -0.19198621771937624F, 0.0F, 0.0F);
        this.meioCauda = new AdvancedModelRenderer(this, 0, 0);
        this.meioCauda.setRotationPoint(0.5F, 5.0F, 0.2F);
        this.meioCauda.addBox(0.1F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(meioCauda, -0.40980330836826856F, 0.0F, 0.0F);
        this.osso1AsaEsquerda = new AdvancedModelRenderer(this, 0, 0);
        this.osso1AsaEsquerda.setRotationPoint(11.6F, 0.4F, 0.3F);
        this.osso1AsaEsquerda.addBox(0.0F, -0.7F, 0.0F, 10, 1, 1, 0.0F);
        this.setRotateAngle(osso1AsaEsquerda, 0.045553093477052F, 0.6894050545377601F, 0.0F);
        this.pernaTrasEsquerda = new AdvancedModelRenderer(this, 0, 0);
        this.pernaTrasEsquerda.setRotationPoint(2.0F, 4.6F, -3.3F);
        this.pernaTrasEsquerda.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(pernaTrasEsquerda, -1.0821041362364843F, 0.0F, 0.0F);
        this.panturrilhaFrenteDireita = new AdvancedModelRenderer(this, 0, 0);
        this.panturrilhaFrenteDireita.setRotationPoint(0.0F, 3.4F, 0.3F);
        this.panturrilhaFrenteDireita.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(panturrilhaFrenteDireita, -0.8028514559173915F, 0.0F, 0.0F);
        this.peTrasDireito = new AdvancedModelRenderer(this, 0, 0);
        this.peTrasDireito.setRotationPoint(0.3F, 3.9F, 1.2F);
        this.peTrasDireito.addBox(-1.0F, 0.0F, -2.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(peTrasDireito, 0.1338053076809694F, 0.0F, 0.0F);
        this.pernaTrasDireita = new AdvancedModelRenderer(this, 0, 0);
        this.pernaTrasDireita.setRotationPoint(-2.7F, 4.5F, -3.3F);
        this.pernaTrasDireita.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(pernaTrasDireita, -1.0768681484805014F, 0.0F, 0.0F);
        this.peFrenteEsquerdo = new AdvancedModelRenderer(this, 0, 0);
        this.peFrenteEsquerdo.setRotationPoint(0.5F, 2.8F, 1.1F);
        this.peFrenteEsquerdo.addBox(-1.0F, 0.0F, -2.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(peFrenteEsquerdo, 0.4012511950334963F, 0.0F, 0.0F);
        this.scaleE = new AdvancedModelRenderer(this, 20, 11);
        this.scaleE.mirror = true;
        this.scaleE.setRotationPoint(2.3F, -8.0F, 0.0F);
        this.scaleE.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.panturrilhaTrasDireita = new AdvancedModelRenderer(this, 0, 0);
        this.panturrilhaTrasDireita.setRotationPoint(0.0F, 1.7F, 0.5F);
        this.panturrilhaTrasDireita.addBox(0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(panturrilhaTrasDireita, -0.3839724354387525F, 0.0F, 0.0F);
        this.fimCauda = new AdvancedModelRenderer(this, 0, 0);
        this.fimCauda.setRotationPoint(0.5F, 5.2F, -0.2F);
        this.fimCauda.addBox(0.1F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(fimCauda, 0.35814156250923646F, 0.0F, 0.0F);
        this.osso1AsaDireita = new AdvancedModelRenderer(this, 0, 0);
        this.osso1AsaDireita.setRotationPoint(11.8F, 0.4F, -0.1F);
        this.osso1AsaDireita.addBox(0.0F, -0.7F, 0.0F, 10, 1, 1, 0.0F);
        this.setRotateAngle(osso1AsaDireita, 0.2103121748653167F, -0.5462880558742251F, 0.0F);
        this.chest = new AdvancedModelRenderer(this, 0, 0);
        this.chest.setRotationPoint(0.0F, 12.7F, 0.0F);
        this.chest.addBox(-3.0F, -4.0F, -3.0F, 6, 11, 6, 0.0F);
        this.setRotateAngle(chest, 1.4114477660878142F, 0.0F, 0.0F);
        this.peleAsadireita = new AdvancedModelRenderer(this, 44, 6);
        this.peleAsadireita.setRotationPoint(6.1F, 0.6F, 0.4F);
        this.peleAsadireita.addBox(-4.7F, 0.0F, 0.0F, 10, 6, 0, 0.0F);
        this.setRotateAngle(peleAsadireita, -0.05235987755982988F, 0.0F, -0.0307177948351002F);
        this.pernaFrenteEsquerda = new AdvancedModelRenderer(this, 0, 0);
        this.pernaFrenteEsquerda.setRotationPoint(1.9F, -3.5F, -3.0F);
        this.pernaFrenteEsquerda.addBox(0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(pernaFrenteEsquerda, -1.0821041362364843F, 0.0F, 0.0F);
        this.peFrentedireito = new AdvancedModelRenderer(this, 0, 0);
        this.peFrentedireito.setRotationPoint(0.5F, 2.8F, 1.1F);
        this.peFrentedireito.addBox(-1.0F, 0.0F, -2.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(peFrentedireito, 0.4012511950334963F, 0.0F, 0.0F);
        this.bocaC = new AdvancedModelRenderer(this, 0, 0);
        this.bocaC.setRotationPoint(0.0F, -1.8F, -7.9F);
        this.bocaC.addBox(-1.9F, -5.9F, -2.0F, 6, 5, 1, 0.0F);
        this.setRotateAngle(bocaC, -1.593485607070823F, 0.0F, 0.0F);
        this.scaleD = new AdvancedModelRenderer(this, 20, 6);
        this.scaleD.mirror = true;
        this.scaleD.setRotationPoint(-1.1F, -8.0F, 0.0F);
        this.scaleD.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.pele1Asadireita = new AdvancedModelRenderer(this, 44, 0);
        this.pele1Asadireita.setRotationPoint(4.5F, 0.2F, 0.4F);
        this.pele1Asadireita.addBox(-4.7F, 0.0F, 0.0F, 10, 6, 0, 0.0F);
        this.setRotateAngle(pele1Asadireita, -0.23422318561763902F, -0.017453292519943295F, -0.02617993877991494F);
        this.pernaFrenteDireita = new AdvancedModelRenderer(this, 0, 0);
        this.pernaFrenteDireita.setRotationPoint(-2.9F, -3.5F, -3.0F);
        this.pernaFrenteDireita.addBox(0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(pernaFrenteDireita, -1.0821041362364843F, 0.0F, 0.0F);
        this.BocaB = new AdvancedModelRenderer(this, 0, 0);
        this.BocaB.setRotationPoint(0.0F, 1.1F, -7.3F);
        this.BocaB.addBox(-1.9F, -5.9F, -2.0F, 6, 5, 1, 0.0F);
        this.setRotateAngle(BocaB, -1.3658946726107624F, 0.0F, 0.0F);
        this.panturrilhaFrenteEsquerda = new AdvancedModelRenderer(this, 0, 0);
        this.panturrilhaFrenteEsquerda.setRotationPoint(0.0F, 3.4F, 0.3F);
        this.panturrilhaFrenteEsquerda.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(panturrilhaFrenteEsquerda, -0.8028514559173915F, 0.0F, 0.0F);
        this.cabeca = new AdvancedModelRenderer(this, 0, 21);
        this.cabeca.setRotationPoint(-1.0F, -6.8F, 2.3F);
        this.cabeca.addBox(-2.0F, -6.0F, -2.0F, 6, 6, 5, 0.0F);
        this.setRotateAngle(cabeca, -1.4114477660878142F, 0.0F, 0.0F);
        this.peTrasEsquerdo = new AdvancedModelRenderer(this, 0, 0);
        this.peTrasEsquerdo.setRotationPoint(0.3F, 3.9F, 1.2F);
        this.peTrasEsquerdo.addBox(-1.0F, 0.0F, -2.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(peTrasEsquerdo, 0.13386675362796507F, 0.0F, 0.0F);
        this.pele1AsaEsquerda = new AdvancedModelRenderer(this, 44, 18);
        this.pele1AsaEsquerda.setRotationPoint(4.6F, 0.2F, 0.3F);
        this.pele1AsaEsquerda.addBox(-4.7F, 0.0F, 0.0F, 10, 6, 0, 0.0F);
        this.setRotateAngle(pele1AsaEsquerda, -0.14206980111233844F, -0.017453292519943295F, 0.014835298641951801F);
        this.ossoAsaEsquerda = new AdvancedModelRenderer(this, 0, 0);
        this.ossoAsaEsquerda.setRotationPoint(1.0F, -0.8F, 2.3F);
        this.ossoAsaEsquerda.addBox(0.0F, 0.0F, 0.0F, 12, 1, 1, 0.0F);
        this.setRotateAngle(ossoAsaEsquerda, 0.0F, -0.29914943379182807F, -0.3127630019573839F);
        this.chest.addChild(this.ossoAsaDireita);
        this.pernaTrasEsquerda.addChild(this.panturrilhaTrasEsquerda);
        this.ossoAsaEsquerda.addChild(this.peleAsaEsquerda);
        this.chest.addChild(this.inicioCauda);
        this.inicioCauda.addChild(this.meioCauda);
        this.ossoAsaEsquerda.addChild(this.osso1AsaEsquerda);
        this.chest.addChild(this.pernaTrasEsquerda);
        this.pernaFrenteDireita.addChild(this.panturrilhaFrenteDireita);
        this.panturrilhaTrasDireita.addChild(this.peTrasDireito);
        this.chest.addChild(this.pernaTrasDireita);
        this.panturrilhaFrenteEsquerda.addChild(this.peFrenteEsquerdo);
        this.cabeca.addChild(this.scaleE);
        this.pernaTrasDireita.addChild(this.panturrilhaTrasDireita);
        this.meioCauda.addChild(this.fimCauda);
        this.ossoAsaDireita.addChild(this.osso1AsaDireita);
        this.ossoAsaDireita.addChild(this.peleAsadireita);
        this.chest.addChild(this.pernaFrenteEsquerda);
        this.panturrilhaFrenteDireita.addChild(this.peFrentedireito);
        this.cabeca.addChild(this.bocaC);
        this.cabeca.addChild(this.scaleD);
        this.osso1AsaDireita.addChild(this.pele1Asadireita);
        this.chest.addChild(this.pernaFrenteDireita);
        this.cabeca.addChild(this.BocaB);
        this.pernaFrenteEsquerda.addChild(this.panturrilhaFrenteEsquerda);
        this.chest.addChild(this.cabeca);
        this.panturrilhaTrasEsquerda.addChild(this.peTrasEsquerdo);
        this.osso1AsaEsquerda.addChild(this.pele1AsaEsquerda);
        this.chest.addChild(this.ossoAsaEsquerda);
          updateDefaultPose();
          
          chest.scaleChildren = true;  
          cabeca.scaleChildren = true;
          pernaFrenteEsquerda.scaleChildren = true;
          pernaFrenteDireita.scaleChildren = true;
          inicioCauda.scaleChildren = true; 
          pernaTrasDireita.scaleChildren = true;
          pernaTrasEsquerda.scaleChildren = true;
          ossoAsaDireita.scaleChildren = true;
          ossoAsaEsquerda.scaleChildren = true;
          bocaC.scaleChildren = true;
          BocaB.scaleChildren = true;
          scaleE.scaleChildren = true;
          scaleD.scaleChildren = true;
          panturrilhaFrenteEsquerda .scaleChildren = true;
          peFrenteEsquerdo.scaleChildren = true; 
          panturrilhaFrenteDireita .scaleChildren = true;
          peFrentedireito.scaleChildren = true;
          meioCauda.scaleChildren = true;
          fimCauda.scaleChildren = true;
          panturrilhaTrasDireita .scaleChildren = true;
          peTrasDireito.scaleChildren = true;
          panturrilhaTrasEsquerda.scaleChildren = true;
          peTrasEsquerdo.scaleChildren = true;
          osso1AsaDireita.scaleChildren = true;
          pele1Asadireita.scaleChildren = true;
          peleAsadireita.scaleChildren = true;
          osso1AsaEsquerda.scaleChildren = true;
          peleAsaEsquerda.scaleChildren = true;
          pele1AsaEsquerda.scaleChildren = true;
    }
    

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
   	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.chest.render(f5);
    }

    
    public void setRotateAngle(ModelRenderer ModelRenderer, float x, float y, float z) {
        ModelRenderer.rotateAngleX = x;
        ModelRenderer.rotateAngleY = y;
        ModelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
      resetToDefaultPose();
 
       
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

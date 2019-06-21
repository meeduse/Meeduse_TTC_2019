# Meeduse_TTC_2019


Meeduse was conceived in order to define proved executional semantics of domain specific languages (DSLs). 
It integrates the formal B method within EMF-based frameworks like XText, Sirius, GMF... The challenge of the TTC case
study, for us, is to define and run model transformations as exectutional semantics using our tools: Meeduse for EMF integration 
and ProB for animation and model-checking.

To Use Meeduse please follow these steps:

0. **Clone this git repository** on your computer

1. **Install Eclipse**. There are 2 possiblilities

    1. Directly download Eclipse Oxygen (the tool was developed and tested on this eclipse version), from:

       https://www.eclipse.org/downloads/packages/release/oxygen/3a/eclipse-modeling-tools

       Beware however that Eclipse Oxygen is incompatible with recent versions of openjdk java on Linux (version>9). On Windows and Mac we have tested using Oracle JavaRE (Java8)

    2. Download the latest Eclipse from Eclipse site. With recent versions, you will download an Eclipse installer - In that case install ``Eclipse Modelling tools``

2. **Launch your eclipse** and **install Meeduse** from the update site **http://vasco.imag.fr/tools/meeduse/ttc2019/Meeduse_updatesite/** 

     see https://help.eclipse.org/oxygen/topic/org.eclipse.platform.doc.user/tasks/tasks-129.htm?cp=0_3_17 for instructions on how to install software from update sites
  
3. In order to replay the Meeduse solution for TTC'2019, you should **import into your main workspace** the three projects from [folder eclipse_wksp](eclipse_wksp):
   * _**ttc2019.metamodels**_: is provided by TTC'2019

   * _**Meeduse\_tt2bdd**_: is a merging meta-model (Meeduse uses only one meta-model that's why we need to merge the TT meta-model and the BDD meta-model)
   
   * _**MeeduseRepo**_: is a driver that introduces a tt model into the merging model, and extracts a bdd from the merging model to a bdd model.

   see https://help.eclipse.org/oxygen/topic/org.eclipse.platform.doc.user/tasks/tasks-importproject.htm?cp=0_3_10_0 for instructions on importing existing projects into your workspace

4. From your main eclipse workspace **execute a runtime instance of eclipse**: Select project _**Meeduse\_tt2bdd**_,
  and right click ``Run As/Eclipse Application``

5. **In the new Eclipse runtime instance, import the two projects** from [folder runtime_wksp](runtime_wksp):
   * _**meeduse.tt2bdd.design**_ is a sirius design project, if you would like to visualize a TT and a BDD
   * _**meeduse.tt2bdd.sample**_ contains input models with their solutions.

6. **Follow the tutorial videos** that we provide (click on the links bellow) and enjoy Meeduse.
   *  **[random_animation.mov](http://vasco.imag.fr/tools/meeduse/ttc2019/Videos/random_animation.mov)**: it runs randomly the transformation rules until it consumes all the truth table rows and then automatically updates the model. We advise you to start by this tutorial video.

   *  **[step_by_step.mov](http://vasco.imag.fr/tools/meeduse/ttc2019/Videos/step_by_step.mov  )**: this is useful for debugging the transformation rules. This facility of Meeduse allows manual animation with an automatic update of the model at every step of the animation.
   *  **[model_checking.mov](http://vasco.imag.fr/tools/meeduse/ttc2019/Videos/model_checking.mov)**: this solution is useful for big/huge examples, it shows how the ProB model-checker can be used outside Meeduse, and how its outputs can be loaded in Meeduse in order to update the model. 
   
      **N.B.** If you would like to use ProB outside Meeduse (like in video model_checking.mov), you need to install ProB and call command `probcli`: https://www3.hhu.de/stups/downloads/prob/tcltk/nightly/. An example of a prob command is provided in file [command.txt](command.txt)


You can find a brief summary of Meeduse with some demonstration videos at: http://vasco.imag.fr/tools/meeduse/

Contributors:

    * Akram Idani: Grenoble INP, France - leader of the Meeduse project.
    * German Vega: CNRS France.
    * Michael Leuschel: University of Dusseldorf, Germany.

Acknowledgment:

   * We woud like to thank Yves Ledru and Jean-Luc Richier for testing these artifacts on both Windows and Linux.

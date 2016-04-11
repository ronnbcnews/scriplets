import jenkins.model.*
import hudson.tools.*
import jenkins.plugins.nodejs.tools.NodeJSInstaller
import jenkins.plugins.nodejs.tools.NodeJSInstallation

// TODO: complete this script
def inst = Jenkins.getInstance()
def desc = inst.getDescriptor("jenkins.plugins.nodejs.tools.NodeJSInstallation")
def installer = new NodeJSInstaller("0.10.44", "",0)
def prop = new InstallSourceProperty([installer])
def sinst = new NodeJSInstallation("qeow_0_10_36", "",[prop])

for(NodeJSInstallation nodeJSInstallation : desc.getInstallations() ){
  sinst.add(nodeJSInstallation)
//  return nodeJSInstallation
}

//desc.setInstallations(sinst)
//desc.save()

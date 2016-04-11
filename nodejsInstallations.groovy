import jenkins.model.*
import jenkins.plugins.nodejs.tools.NodeJSInstallation
import jenkins.plugins.nodejs.NodeJSPlugin

def inst = Jenkins.getInstance()
def desc = inst.getDescriptor("jenkins.plugins.nodejs.tools.NpmPackagesBuildWrapper")

// NodeJSInstallation nodeJSInstallation = NodeJSPlugin.instance()

for(NodeJSInstallation nodeJSInstallation : desc.getInstallations() ){
  return nodeJSInstallation.getName();
}
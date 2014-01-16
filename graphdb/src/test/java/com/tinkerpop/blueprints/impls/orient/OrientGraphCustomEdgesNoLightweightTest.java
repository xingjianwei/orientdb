package com.tinkerpop.blueprints.impls.orient;

import com.tinkerpop.blueprints.Graph;
import org.hamcrest.core.AnyOf;
import org.hamcrest.core.IsEqual;
import org.junit.Assume;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Test suite for OrientDB graph implementation that store edges using custom classes derived by labels.
 * 
 * @author Luca Garulli (http://www.orientechnologies.com)
 */
@RunWith(JUnit4.class)
public class OrientGraphCustomEdgesNoLightweightTest extends OrientGraphTest {
  @Before
  public void setUp() throws Exception {
    Assume.assumeThat(getEnvironment(), AnyOf.anyOf(IsEqual.equalTo(ENV.CI), IsEqual.equalTo(ENV.RELEASE)));
    super.setUp();
  }

  public Graph generateGraph(final String graphDirectoryName) {
    this.currentGraph = (OrientGraph) super.generateGraph(graphDirectoryName);
    this.currentGraph.setUseClassForEdgeLabel(true);
    this.currentGraph.setUseLightweightEdges(false);

    if (currentGraph.getEdgeType("friend") == null)
      currentGraph.createEdgeType("friend");
    if (currentGraph.getEdgeType("test") == null)
      currentGraph.createEdgeType("test");
    if (currentGraph.getEdgeType("knows") == null)
      currentGraph.createEdgeType("knows");
    if (currentGraph.getEdgeType("created") == null)
      currentGraph.createEdgeType("created");
    if (currentGraph.getEdgeType("collaborator") == null)
      currentGraph.createEdgeType("collaborator");
    if (currentGraph.getEdgeType("hate") == null)
      currentGraph.createEdgeType("hate");
    if (currentGraph.getEdgeType("hates") == null)
      currentGraph.createEdgeType("hates");
    if (currentGraph.getEdgeType("test-edge") == null)
      currentGraph.createEdgeType("test-edge");
    if (currentGraph.getEdgeType("self") == null)
      currentGraph.createEdgeType("self");
    if (currentGraph.getEdgeType("x") == null)
      currentGraph.createEdgeType("x");
    if (currentGraph.getEdgeType("y") == null)
      currentGraph.createEdgeType("y");
    if (currentGraph.getEdgeType("test1") == null)
      currentGraph.createEdgeType("test1");
    if (currentGraph.getEdgeType("test2") == null)
      currentGraph.createEdgeType("test2");
    if (currentGraph.getEdgeType("test3") == null)
      currentGraph.createEdgeType("test3");

    return this.currentGraph;
  }

}
